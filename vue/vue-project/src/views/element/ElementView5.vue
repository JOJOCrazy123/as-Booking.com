<template>
    <div style="position:relative;">
        <img :src="urls[0]">
        <div style="position:absolute;top: 130px;left: 38%;font-size: 30px;color: #262626;">
            <div style="text-align: center;">
                <b>查收邮件</b>
            </div>
            <br>
            <div style="font-size: 17px;display: flex;">
                我们已向
                <div style="font-weight:bolder;">{{mailbox}}</div>
                发送了验证链接。接收成<br>
            </div>
            <div style="font-size: 17px;text-align: center;">功后10分钟内有效。</div>
            <br>
            <el-button @click="navigatorToLog" style="width: 100%;height: 60px;" type="primary" plain>返回登录界面</el-button>
            <hr>
            <p>登录或注册帐号即代表您同意本公司的
                <span class="blue-text">相关条款</span>以及
                <span class="blue-text">隐私声明</span>
            </p>
            <hr>
            <div class="centered-text">
                <p>保留所有权利</p>
                <p>版权所有 (2006 - 2023) - Booking.com™</p>
            </div>
        </div>
    </div>
  </template>

  <script>
  import axios from "axios";

  export default {
    data () {
        return {
            mailbox:"",
          name:"log5",
          urls:[],
        };
    },
    created(){
        this.mailbox = this.$route.params.RegisteredMailbox_;
    },
    mounted() {
      axios.get('api/urls',{
        params:{page:this.name}
      })
          .then(response => {
            if (response.data.code === 1) {
              alert("获取成功！");
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
    methods:{
        navigatorToLog(){
          // 用户存在，进行路由跳转
          this.$router.push({
            name: 'home',
            params: { IsLogIn: true }
          });
        },
    },
  };
  </script>

<style scoped>
.el-button--book{background: rgb(0,108,228);
  color: #e5e9f2}
.el-button--book:hover {
  background: rgb(0,59,149);
  color: #e5e9f2;
}
.el-button--book:focus {
  background: rgb(0,59,149);
  color: #e5e9f2;
}
.el-icon-chat-round{
 font-size: 40px;
}
.el-icon-mobile-phone{
  font-size: 40px;
}
.el-icon-message{
  font-size: 40px;
}.el-button--text{background: rgb(255,255,255);
   color: rgb(0,108,228)}
.el-button--text:hover {
  background: rgb(255,255,255);
  color: #262626;
}
.el-button--text:focus {
  background: rgb(255,255,255);
  color: #262626;
}
.image-container {
    display: flex;
    justify-content: center; /* 水平居中 */
    align-items: center; /* 垂直居中 */
}

p {
    font-size: 15px; /* 设置段落文本的字体大小为15px */
}

.blue-text {
    color: blue; /* 设置文本颜色为蓝色 */
    font-size: 15px; /* 设置字体大小为15px */
}

.centered-text {
    text-align: center; /* 居中文本 */
}

.centered-text p {
    font-size: 15px; /* 设置字体大小为15px */
}

.line{
    display:inline-block;
    border-top:1px solid #000;
}
</style>
