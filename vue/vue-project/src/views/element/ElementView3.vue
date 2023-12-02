<template>
    <div style="position:relative;">
        <img :src="urls[0]">
        <div style="position:absolute;top: 130px;left: 38%;font-size: 30px;color: #262626;">
            <b>
            {{ str1 }}
            </b>
            <br>
            <br>
            <div style="font-size: 17px;display: flex;">
                {{str2}}
                <div style="font-weight:bolder;">
                    {{RegisteredMailbox}}
                </div>
                {{ str3 }}
            </div>
            <br>
            <div style="font-size: 20px;margin-bottom: 10px;">密码</div>
            <el-form :model="ruleForm" status-icon :rules="rules" ref="ruleForm" class="demo-ruleForm">
                <el-form-item prop="pass">
                    <el-input placeholder="请输入密码" type="password" v-model="ruleForm.pass" autocomplete="off"></el-input>
                </el-form-item>
                <el-form-item>
                    <el-button style="width: 100%;height: 60px;" type="primary" @click="submitForm('ruleForm')">{{str4}}</el-button>
                </el-form-item>
                <img :src="urls[1]">
            </el-form>
            <el-button @click="navigatorToLog5" style="width: 100%;height: 60px;" type="primary" plain>{{str5}}</el-button>
            <el-button @click="navigatorToLog4" type="text" style="color: blue;text-align: center;margin-left: 45%;">忘记密码？</el-button>
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
    props: {
        log1data: Object // 声明一个名为 ruleForm 的 prop，类型为对象
    },

    data () {
        var validatePass = (rule, value, callback) => {
        if (value.length < 10) {
        callback(new Error('密码必须至少有10个字符'));
        }
        else {
                var hasDigit = /\d/.test(value);
                var hasLowercase = /[a-z]/.test(value);
                var hasUppercase = /[A-Z]/.test(value);
                if (!hasDigit) {
                    callback(new Error('密码必须至少包含1个数字'));
                } else if (!hasLowercase ) {
                    callback(new Error('密码必须至少包含1个小写字母'));
                } else if (!hasUppercase) {
                    callback(new Error('密码必须至少包含1个大写字母'));
                }else {
                    if (this.ruleForm.checkPass !== '') {
                    this.$refs.ruleForm.validateField('checkPass');
                    }
                    callback();
                }
            }
        };
        return {
          name:"log3",
          urls:[],
            RegisteredMailbox:"",
            str1:"输入密码",
            str2:"请输入",
            str3:"对应的Booking.com密码。",
            str4:"登录",
            str5:"使用验证链接登录",
            ruleForm: {
                pass: '',
            },
            rules: {
                pass: [{ validator: validatePass, trigger: 'blur' }],
            },
            LogInfo:{
                mailbox:"",
                password:"",
            },
        };
    },
    created(){
        this.RegisteredMailbox = this.log1data.mailbox;
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
    methods:{
        submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          this.LogInfo.mailbox = this.RegisteredMailbox;
          this.LogInfo.password = this.ruleForm.pass;
          if (valid) {
            axios.get('api/password',{
              params:{mailbox:this.LogInfo.mailbox,
              password:this.LogInfo.password}
            })
                .then(response => {
                  if (response.data.data === true) {
                    // 用户存在，进行路由跳转
                    this.$router.push({
                      name: 'home',
                      params: { IsLogIn: true }
                    });
                    alert("登录成功！");
                  } else {
                    // 用户不存在的处理
                    alert("密码错误，请重新输入");
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
         navigatorToLog5() {
            const RegisteredMailbox_ = this.RegisteredMailbox; // 设置要传递的字符串
            // 使用路由来导航到log5页面
            this.$router.push({ name: 'log5', params: { RegisteredMailbox_ } });
            // alert(RegisteredMailbox_);
        },
        navigatorToLog4() {
            const RegisteredMailbox_ = this.RegisteredMailbox; // 设置要传递的字符串
            // 使用路由来导航到log5页面
            this.$router.push({ name: 'log4', params: { RegisteredMailbox_ } });
            // alert(RegisteredMailbox_);
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
