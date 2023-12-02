<template>
  <div style="width: 80%;margin: auto">
    <el-container>
      <el-col span="6">
        <el-row><el-link type="primary">国家/地区</el-link></el-row>
        <el-row><el-link type="primary">区域</el-link></el-row>
        <el-row><el-link type="primary">城市</el-link></el-row>
        <el-row><el-link type="primary">区</el-link></el-row>
        <el-row><el-link type="primary">机场</el-link></el-row>
        <el-row><el-link type="primary">酒店</el-link></el-row>
        <el-row><el-link type="primary">周边地标景点</el-link></el-row>
      </el-col>
      <el-col span="6">
        <el-row><el-link type="primary">民宿短租</el-link></el-row>
        <el-row><el-link type="primary">公寓</el-link></el-row>
        <el-row><el-link type="primary">度假村</el-link></el-row>
        <el-row><el-link type="primary">别墅</el-link></el-row>
        <el-row><el-link type="primary">青旅</el-link></el-row>
        <el-row><el-link type="primary">住宿加早餐旅馆</el-link></el-row>
        <el-row><el-link type="primary">旅馆</el-link></el-row>
      </el-col>
      <el-col span="6">
        <el-row><el-link type="primary">全球独特住宿</el-link></el-row>
        <el-row><el-link type="primary">所有目的地</el-link></el-row>
        <el-row><el-link type="primary">所有航班目的地</el-link></el-row>
        <el-row><el-link type="primary">所有租车点</el-link></el-row>
        <el-row><el-link type="primary">发现精彩</el-link></el-row>
        <el-row><el-link type="primary">客人点评</el-link></el-row>
        <el-row><el-link type="primary">探索月租</el-link></el-row>
        <el-row><el-link type="primary">游记攻略</el-link></el-row>
        <el-row><el-link type="primary">季节和假日优惠</el-link></el-row>
        <el-row><el-link type="primary">Traveller Review Awards</el-link></el-row>
      </el-col>
      <el-col span="6">
        <el-row><el-link type="primary">租车服务</el-link></el-row>
        <el-row><el-link type="primary">订机票</el-link></el-row>
        <el-row><el-link type="primary">餐厅订位</el-link></el-row>
        <el-row><el-link type="primary">Booking.com旅行代理机构中心</el-link></el-row>
      </el-col>
      <el-col span="6">
        <el-row><el-link type="primary">疫情常见问题解答</el-link></el-row>
        <el-row><el-link type="primary">关于本站</el-link></el-row>
        <el-row><el-link type="primary">客服帮助</el-link></el-row>
        <el-row><el-link type="primary">酒店自助平台</el-link></el-row>
        <el-row><el-link type="primary">Careers</el-link></el-row>
        <el-row><el-link type="primary">可持续发展项目</el-link></el-row>
        <el-row><el-link type="primary">新闻中心</el-link></el-row>
        <el-row><el-link type="primary">安全旅行信息中心</el-link></el-row>
        <el-row><el-link type="primary">投资者关系</el-link></el-row>
        <el-row><el-link type="primary">条款与条件</el-link></el-row>
        <el-row><el-link type="primary">合作伙伴申诉</el-link></el-row>
        <el-row><el-link type="primary">我们如何运作</el-link></el-row>
        <el-row><el-link type="primary">隐私和cookie声明</el-link></el-row>
        <el-row><el-link type="primary">管理cookie设置</el-link></el-row>
        <el-row><el-link type="primary">个性化推荐</el-link></el-row>
        <el-row><el-link type="primary">MSA声明</el-link></el-row>
        <el-row><el-link type="primary">其他问题查询</el-link></el-row>
      </el-col>
    </el-container>
    <el-container>
      <div style="width: 100%;margin: auto">
        <img :src="urls[0]">
      </div>
    </el-container>
  </div>
</template>
<script>
import axios from "axios";

export default {
  data() {
    return {
      urls:[],
      name:"HomeView_Com13",
    };
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
