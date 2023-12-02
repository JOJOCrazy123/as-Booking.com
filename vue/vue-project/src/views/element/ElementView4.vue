<template>
    <div style="position:relative;">
        <img :src="urls[0]">
        <div style="position:absolute;top: 130px;left: 38%;font-size: 30px;color: #262626;">
            <b>忘记密码？</b>
            <br>
            <br>
            <div style="font-size: 17px;display: flex;">没问题！我们会向你发送重置密码链接。请输入用于登录<br>Booking.com的电子邮箱。</div>
            <br>
            <div style="font-size: 20px;margin-bottom: 10px;">你的邮箱地址</div>
            <el-form :model="ruleForm" status-icon :rules="rules" ref="ruleForm" class="demo-ruleForm">
                <el-form-item prop="mailbox">
                    <el-input v-model="ruleForm.mailbox" autocomplete="off"></el-input>
                </el-form-item>
                <el-form-item>
                    <el-button style="width: 100%;height: 60px;" type="primary" @click="submitForm('ruleForm')">发送重置链接</el-button>
                </el-form-item>
            </el-form>
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
    // props: {
    //     log1data: Object // 声明一个名为 ruleForm 的 prop，类型为对象
    // },
    data () {
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
          name:"log4",
          urls:[],
            mailboxVerify:false,//邮箱是否合法
            ruleForm: {
                mailbox: '',
            },
            rules: {
                mailbox: [
                { required: true, message: '请输入邮箱地址', trigger: 'blur' },
                {validator: CheckMailbox, trigger: "blur"},
                ]
            },
        };
    },
    mounted() {
      this.ruleForm.mailbox = this.$route.params.RegisteredMailbox_;
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
    methods:{
        submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            axios.get('api/users',{
              params:{mailbox:this.ruleForm.mailbox}
            })
                .then(response => {
                  if (response.data.data === 1) {
                    // 用户存在，进行路由跳转
                    // alert("用户存在！");
                    const RegisteredMailbox_ = this.ruleForm.mailbox;
                    this.$router.push({ name: 'log5', params: { RegisteredMailbox_ } });
                  } else {
                    // 用户不存在的处理
                    alert("该用户不存在！");
                  }
                })
                .catch(error => {
                  console.error('Error:', error);
                  alert('查询失败');
                });
          } else {
            alert('error submit!!');
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
