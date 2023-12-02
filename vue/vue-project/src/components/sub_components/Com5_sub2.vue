<template>
  <div style="margin-left: auto">
    <el-row :gutter="0">
      <el-col :span="8.5"><div class="grid-content">
        <a href="sy">
          <img :src="urls[0]" class="threeline">
        </a>
      </div></el-col>
      <el-col :span="8.5"><div class="grid-content ">
        <img :src="urls[1]" class="threeline">
      </div></el-col>
      <el-col :span="8.5"><div class="grid-content ">
        <img :src="urls[2]" class="threeline">
      </div></el-col>
    </el-row>
    <div>
      &nbsp;
    </div>
  </div>

</template>

<script>
import axios from "axios";

export default {
  data() {
    return {
      name:"Com5_sub2",
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

.el-col {
  border-radius: 4px;
}
.bg-purple-dark {
  background: #99a9bf;
}
.bg-purple {
  background: #d3dce6;
}
.bg-purple-light {
  background: #e5e9f2;
}


.grid-content {
  border-radius: 4px;
  min-height: 290px;
  width: 99%;
}
.threeline{
  border-radius: 4px;
  width: 93%;
  height: 290px;
  margin-top: 0%;
}
</style>
