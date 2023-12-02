<template>
  <div class="Com1_sub1">
    <el-card :body-style="{ padding: '0px' }">
      <div>
        关注Booking.com官方微信号
      </div>
      <div>
        <img :src="urls[0]" class="image">
      </div>
      <div>
        全球特价酒店应有尽有
      </div>
    </el-card>
  </div>

</template>

<script>
import axios from "axios";

export default {
  data() {
    return {
      name:"Com1_sub1",
      urls:[],
    }
  },
  mounted() {
    axios.get('api/urls',{
      params:{page:this.name}
    })
        .then(response => {
          if (response.data.code === 1) {
            // alert("获取成功！");
            // url获取成功的处理
            this.urls = response.data.data;
          } else {
            // url获取失败的处理
            console.log(response.data.msg);
            alert("获取失败！");
          }
        })
        .catch(error => {
          console.error('Error:', error);
          alert('查询失败');
        });
  },
}
</script>

<style scoped>
.image {
  width: 120px;
  display:inline-block;
}
.Com1_sub1{
  text-align:center;
  width: 200px;
}
</style>
