<!--关于get请求的测试-->
<!--<template>-->
<!--  <div>-->
<!--    <h1>部门列表</h1>-->
<!--    <ul>-->
<!--      <li v-for="dept in departments" :key="dept.id">{{ dept.name }}</li>-->
<!--    </ul>-->
<!--  </div>-->
<!--</template>-->

<!--<script>-->
<!--import axios from 'axios';-->

<!--export default {-->
<!--  data() {-->
<!--    return {-->
<!--      departments: [],-->
<!--      flag:0,-->
<!--    };-->
<!--  },-->
<!--  mounted() {-->
<!--    // 在组件挂载后执行GET请求-->
<!--    this.fetchDepartments();-->
<!--  },-->
<!--  methods: {-->
<!--    fetchDepartments() {-->
<!--      // 使用相对路径，不需要指定完整的URL-->
<!--      axios.get('/api/depts') // 注意这里使用了代理前缀 /api-->
<!--          .then(response => {-->
<!--            if (response.data.code === 1) {-->
<!--              // 如果响应状态码为1，表示成功-->
<!--              this.departments = response.data.data; // 存储实际数据-->
<!--            } else {-->
<!--              // 如果响应状态码为0，表示失败-->
<!--              console.error('Error fetching departments:', response.data.msg);-->
<!--            }-->
<!--          })-->
<!--          .catch(error => {-->
<!--            // 处理请求错误-->
<!--            console.error('Error fetching departments:', error);-->
<!--          });-->
<!--    },-->
<!--  },-->
<!--};-->
<!--</script>-->

<!--关于以JSON格式发起POST请求的测试-->
<template>
  <div>
    <button @click="insertUser">插入用户</button>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  methods: {
    insertUser() {
      // 创建包含JSON数据的对象
      const userData = {
        mailbox: 'ljk@sbsbsbsbsbsbsb',
        password: 'ljksb',
      };

      // 使用Axios发送POST请求，设置Content-Type为"application/json"
      axios.post('/api/addUser', userData, {
        headers: {
          'Content-Type': 'application/json', // 设置Content-Type头为"application/json"
        },
      })
          .then(response => {
            // 处理响应
            console.log(response.data.code);
            console.log(response.data.msg);
            console.log(response.data.data);
            // alert("返回结果为："+response.data);
          })
          .catch(error => {
            // 处理错误
            console.error(error);
            // alert(this.response.data);
          });
    },
  },
};
</script>


