<template>
  <div style="position:relative;">
    <img :src="urls[0]">
    <div style="position:absolute;top: 130px;left: 38%;font-size: 30px;color: #262626;">
      <b>
        {{ this.page1.str1 }}
      </b>
      <br>
      <br>
        <div style="font-size: 20px">
          {{this.page1.str2}}
        </div>

        <el-form :model="ruleForm" :rules="rules" ref="ruleForm" class="demo-ruleForm">
          <el-form-item prop="mailbox">
            <el-input v-model="ruleForm.mailbox" placeholder="请输入邮箱地址" style="margin: 15px 0;"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" style="width: 100%;height: 60px;"
             @click="submitForm('ruleForm')">{{this.page1.str3}}</el-button>
          </el-form-item>
        </el-form>

      <img :src="urls[1]">
      <div class="image-container">
        <button class="square-button">
        <img :src="urls[2]" alt="Image">
        </button>
        <button class="square-button">
        <img :src="urls[3]" alt="Image">
        </button>
        <button class="square-button">
        <img :src="urls[4]" alt="Image">
        </button>
      </div>
      <el-button class="custom-button" type="text" @click="OtherWay" v-show="!IsOtherWayClicked">其他登录方法</el-button>
      <button class="square-button" style="margin:20px 175px;" v-show="IsOtherWayClicked">
        <img :src="urls[5]" alt="Image">
      </button>
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
  data() {
    // 验证邮箱是否合法
    var CheckMailbox = (rules, value, callback) => {
      const regMobile = /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
      if (regMobile.test(value) == true) {
        this.mailboxVerify=true;
        return callback();
      } else {
        callback(new Error("请检查邮箱地址是否正确。"));
        this.mailboxVerify=false;
      }
    };
    return {
      name:"log",
      urls:[],
      mailboxVerify:false,//邮箱是否合法
      page1:{
        str1:"登录或创建帐号",
        str2:"电子邮箱或手机号",
        str3:"使用电子邮箱继续",
      },
      ruleForm: {
        mailbox: '',
      },
      rules: {
        mailbox: [
          { required: true, message: '请输入邮箱地址', trigger: 'blur' },
          {validator: CheckMailbox, trigger: "blur"},
        ]
      },
      IsOtherWayClicked:false,
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
  methods: {
    OtherWay:function(){
      this.IsOtherWayClicked = true;
    },
    submitForm(ruleForm) {
        this.$refs[ruleForm].validate((valid) => {
          //跳转至log3
          if (valid) {
            axios.get('api/users',{
              params:{mailbox:this.ruleForm.mailbox}
            })
                .then(response => {
                  if (response.data.data === 1) {
                    // 用户存在，进行路由跳转
                    this.$router.push({
                      name: 'log3',
                      params: { log1data: this.ruleForm },
                    });
                  } else {
                    // 用户不存在的处理
                    this.$router.push({
                      name: 'log2',
                      params: { log1data: this.ruleForm },
                    });
                  }
                })
                .catch(error => {
                  console.error('Error:', error);
                  alert('查询失败');
                });
          } else {
            // alert('error submit!!');
            return false;
          }
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

.square-button {
    width: 100px; /* 按钮宽度 */
    height: 100px; /* 按钮高度 */
    border: none;
    background-color: #ffffff; /* 将按钮背景颜色设为白色 */
    text-align: center;
    cursor: pointer;
    overflow: hidden;
    position: relative;
    margin: 0 10px; /* 添加按钮之间的水平间隔为20px（10px在左边，10px在右边） */
    display: flex;
    justify-content: center;
    align-items: center;
    border-radius: 10px; /* 圆角半径，使按钮呈现圆角正方形的外观 */
    transition: border-color 0.3s; /* 添加过渡效果 */
    border: 1px solid rgb(249, 239, 239);
}

.square-button img {
    width: 100%; /* 图片宽度占满按钮 */
    height: 100%; /* 图片高度占满按钮 */
}

/* 当鼠标悬停时的样式 */
.square-button:hover {
    background-color: #ffffff; /* 悬停时的背景颜色 */
    border-color: #0074D9; /* 边框颜色变为蓝色 */
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
.custom-button {
  font-size: 20px; /* 设置字体大小为20px */
  font-weight: bold; /* 设置为加粗 */
  margin-left: 150px; /* 将按钮右移200px */
}
</style>
