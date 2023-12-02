<template>
    <div style="position:relative;">
        <img :src="urls[0]">
        <div style="position:absolute;top: 130px;left: 38%;font-size: 30px;color: #262626;">
            <b>
            {{ str1 }}
            </b>
            <br>
            <br>
            <div style="font-size: 20px">
                {{str2}}
            </div>
            <br>
            <div style="font-size: 20px">密码</div>
            <el-form :model="ruleForm" status-icon :rules="rules" ref="ruleForm" class="demo-ruleForm">
                <el-form-item prop="pass">
                    <el-input placeholder="请输入密码" type="password" v-model="ruleForm.pass" autocomplete="off"></el-input>
                </el-form-item>
                <div style="font-size: 20px">再次输入密码</div>
                <el-form-item  prop="checkPass">
                    <el-input placeholder="再次输入密码" type="password" v-model="ruleForm.checkPass" autocomplete="off"></el-input>
                </el-form-item>
                <el-form-item>
                    <el-button style="width: 100%;height: 60px;" type="primary" @click="submitForm('ruleForm')">创建账号</el-button>
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
        var validatePass2 = (rule, value, callback) => {
            if (value === '') {
            callback(new Error('请再次输入密码'));
            } else if (value !== this.ruleForm.pass) {
            callback(new Error('两次输入密码不一致!'));
            } else {
            callback();
            }
        };
        return {
            name:"log2",
            LogIn:true,
            urls:[],
            mailbox:"",
            str1:"创建密码",
            str2:"密码至少需10个字符组成，且包含大小写字母和数字。",
            ruleForm: {
                pass: '',
                checkPass: '',
            },
            rules: {
                pass: [{ validator: validatePass, trigger: 'blur' }],
                checkPass: [{ validator: validatePass2, trigger: 'blur' }],
            },
            LogInfo:{
                mailbox:"",
                password:"",
            },
        };
    },
    created(){
        this.mailbox = this.log1data.mailbox;
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
          this.LogInfo.mailbox = this.mailbox;
          this.LogInfo.password = this.ruleForm.pass;
          if (valid) {
            // 使用Axios发送POST请求，设置Content-Type为"application/json"
            axios.post('/api/addUser', this.LogInfo, {
              headers: {
                'Content-Type': 'application/json', // 设置Content-Type头为"application/json"
              },
            })
                .then(response => {
                  // 处理响应
                  console.log(response.data.code);
                  console.log(response.data.msg);
                  console.log(response.data.data);
                  // 用户存在，进行路由跳转
                  this.$router.push({
                    name: 'home',
                    params: { IsLogIn: true }
                  });
                  alert("注册成功！");
                })
                .catch(error => {
                  // 处理错误
                  console.error(error);
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
</style>
