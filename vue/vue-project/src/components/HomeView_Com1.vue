<template>
  <div class="ds1">
    <el-container>
      <el-header>
        <el-row :gutter="20">
          <el-col :span="1"><div class="colorw grid-content"></div></el-col>
          <el-col :span="3"><div class="grid-content">
            <el-button type="text" class="bookelb" @click="goHome">
              <b>
                Booking.com
              </b>
            </el-button>
          </div></el-col>
          <el-col :span="9"><div class="grid-content colorw"></div></el-col>
          <el-col :span="1"><div class="grid-content">
            <el-button type="text" class="bookelb2" title="选择币种" @click="startChooseCny">
              {{nowC}}
            </el-button>

            <!--一个弹窗，用来选择币种-->
            <div v-if="chooseCny" >
              <el-card style="z-index: 10; position: fixed; top:20%;left: 15%; width: 70%; height: 600px">
                <div>
                  <el-button type="text" style="color: black">
                    <b>
                      <span style="font-size: 25px">
                        选择币种
                      </span>
                    </b>
                  </el-button>

                </div>
                <el-select v-model="nowC" placeholder="请选择"
                           style="width: 100%; position: relative"
                           @change="finishChooseCny"
                           filterable >
                  <el-option-group
                      v-for="group in coptions"
                      :key="group.label"
                      :label="group.label">
                    <el-option
                        v-for="item in group.options"
                        :key="item.value"
                        :label="item.label"
                        :value="item.value">
                      <span>
                        {{item.label}}{{item.value}}
                      </span>
                    </el-option>
                  </el-option-group>
                </el-select>
              </el-card>
<!--              <Com1_sub2></Com1_sub2>-->
            </div>
          </div></el-col>
          <el-col :span="1"><div class="grid-content centeri">
            <el-button type="text" title="选择语言">
              <img :src="urls[0]" class="circleimg">
            </el-button>
          </div></el-col>
          <el-col :span="1">
            <div class="grid-content centeri" @mouseover="wxgzh = true" @mouseleave="wxgzh = false">
              <!-- 微信图标-->
              <el-button type="text">
                <img :src="urls[1]" class="circleimgwx">
              </el-button>
              <div v-if="wxgzh">
                <gzh></gzh>
              </div>

            </div>
          </el-col>
          <el-col :span="1">
            <div class="grid-content">
              <el-button type="text" title="联系客服">
                <img :src="urls[2]" class="circleimg">
              </el-button>
            </div>
          </el-col>
          <el-col :span="3">
            <div class="grid-content">
              <!--上线我的住宿-->
              <el-button type="text" class="bookelb2">
                上线我的住宿
              </el-button>
            </div>
          </el-col>
          <div v-show="!IsLogIn">
            <el-col :span="2" >
              <div class="grid-content">
                <!--注册、登录-->
                <el-button @click="gotoLog" class="colorlan">注册</el-button>
              </div>
            </el-col>
            <el-col :span="2">
              <div class="grid-content ">
                <!--注册、登录-->
                <el-button @click="gotoLog" class="colorlan">登录</el-button>
              </div>
            </el-col>
          </div>
          <el-col :span="4" v-show="IsLogIn">
            <el-button @click="showU" style="background-color: transparent;border: none;">
              <div>
                <div style="display: flex; flex-direction: row; align-items: center;">
                  <div>
                    <img src="https://ac-a.static.booking.cn/static/img/identity/profile/b47cd0e05ec8b7831167f4f7593ead56402a6bb4.svg"
                         style="width: 30px; height: 30px">
                  </div>
                  <div style="width: 8px; background-color: transparent">
                  </div>
                  <div >
                    <div>
                      <b>
                              <span style="color: white; font-size: 14px">
                                  你的账户
                              </span>
                      </b>
                    </div>
                    <div>
                          <span style="color: rgb(254,187,2);  font-size: 14px">
                              Genius1级会员
                          </span>
                    </div>
                  </div>
                </div>
              </div>
            </el-button>
            <div v-if="isShowU">
              <div style="background-color: white;border-radius: 10px;">
                <el-row>
                  <el-button icon="el-icon-user"  style="width: 100%; position: relative" @click="gotoAccountManagement">
                    管理账号
                  </el-button>
                </el-row>
                <el-row>
                  <el-button @click="order" icon="el-icon-suitcase-1"  style="width: 100%; position: relative">
                    订单和行程
                  </el-button>
                </el-row>

                <el-row>
                  <el-button style="width: 100%; position: relative">
                    <svg t="1684218121330" @click="myCollection" class="icon" viewBox="0 0 1179 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="3911" width="200" height="200"><path d="M142.31918 540.267127l350.13559 373.653781c54.296613 63.852817 139.806023 63.883844 195.033436-1.054906l362.204951-388.670672c42.661625-48.866952 65.466202-112.130263 65.466203-182.902021a279.239726 279.239726 0 0 0-501.018122-169.653647 30.99561 30.99561 0 0 1-25.534922 12.131415 30.99561 30.99561 0 0 1-25.503895-12.131415A279.239726 279.239726 0 0 0 62.053272 341.293309c0 72.850542 28.792718 144.242832 77.411458 195.498835 1.054906 1.116959 1.985705 2.264944 2.85445 3.474983z m-54.606879 31.926409A349.732244 349.732244 0 0 1 0 341.293309C0 152.806494 152.806184 0.00031 341.292999 0.00031c95.065613 0 183.708713 39.155615 247.313317 106.111096A340.486306 340.486306 0 0 1 835.95066 0.00031c188.486815 0 341.292999 152.806184 341.292999 341.292999 0 80.793361-25.069522 154.636755-72.198982 213.463257-1.147986 1.923651-2.482131 3.754223-4.095516 5.491715l-5.181449 5.553768c-2.699317 3.071637-5.491715 6.112247-8.315138 9.090804-0.620533 0.620533-1.210039 1.241065-1.861598 1.799545L733.810974 954.069375c-79.055869 93.048882-209.553901 93.017855-287.616918 1.147985L90.783938 576.040839a31.243823 31.243823 0 0 1-3.102664-3.847303z" fill="#666666" p-id="3912"></path></svg>
                    收藏
                  </el-button>
                </el-row>
                <el-row>
                  <el-button  style="width: 100%; position: relative"
                              @click="logout">
                    <svg t="1684218352505" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="7432" width="200" height="200"><path d="M896 928H384a32 32 0 0 1-32-32v-128a32 32 0 0 1 64 0v96h448v-704h-448V256a32 32 0 1 1-64 0V128a32 32 0 0 1 32-32h512a32 32 0 0 1 32 32v768a32 32 0 0 1-32 32z" fill="#4D4D4D" p-id="7433"></path><path d="M608 544H192a32 32 0 0 1 0-64h416a32 32 0 0 1 0 64z" fill="#4D4D4D" p-id="7434"></path><path d="M256 672a30.08 30.08 0 0 1-22.4-9.6l-128-128a30.72 30.72 0 0 1 0-44.8l128-128a31.36 31.36 0 1 1 44.8 44.8L173.44 512l104.96 105.6a30.72 30.72 0 0 1 0 44.8 30.08 30.08 0 0 1-22.4 9.6z" fill="#4D4D4D" p-id="7435"></path></svg>
                    退出账号
                  </el-button>
                </el-row>
              </div>
            </div>
          </el-col>
        </el-row>
      </el-header>
      <el-main class="elm1">
        <div class="divsyelm">
          <div>
            <div>
          <span class="spansyelm1">
            <b style="font-size: larger">
              寻找下一程住宿
            </b>
          </span>
            </div>
            <div>
          <span class="spansyelm2">
            酒店、民宿……更多住宿优惠搜不停
          </span>
            </div>
          </div>
        </div>
      </el-main>
    </el-container>
  </div>
</template>

<script>
import gzh from '../components/sub_components/Com1_sub1.vue'
import axios from "axios";
// import axios from 'axios';
// import Com1_sub2 from "@/components/sub_components/Com1_sub2.vue";
export default {
    props: {
      IsLogIn: Boolean, // 声明一个名为 IsLogIn 的 prop，类型为布尔值
    },
  data() {
    return {
      isShowU: false,
      Depts:[],
      coptions: [{
        label: '为你推荐',
        options: [{
          value: 'CNY',
          label: '人民币'
        },{
          value: 'HKD',
          label: '港币'
        }, {
          value: 'EUR',
          label: '欧元'
        },{
          value: 'USD',
          label: '美元'
        }, {
          value: 'GBP',
          label: '英镑'
        },{
          value: 'JPY',
          label: '日元'
        },{
          value: 'AUD',
          label: '澳元'
        }]
      }, {
        label: '所有货币',
        options: [{
          value: 'CNY',
          label: '人民币'
        }, {
          value: 'KRW',
          label: '韩元'
        }, {
          value: 'CHF',
          label: '瑞士法郎'
        }, {
          value: 'JOD',
          label: '约旦第纳尔'
        },{
          value: 'KWD',
          label: '科威特第纳尔'
        },{
          value: 'OMR',
          label: '阿曼里亚尔'
        },{
          value: 'QAR',
          label: '卡塔尔里亚尔'
        },{
          value: 'SAR',
          label: '沙特里亚尔'
        },{
          value: 'AED',
          label: '阿联酋迪拉姆'
        },{
          value: 'BHD',
          label: '巴林第纳尔'
        },{
          value: 'BND',
          label: '文莱元'
        },{
          value: 'CAD',
          label: '加拿大元'
        },{
          value: 'CZK',
          label: '捷克克朗'
        },{
          value: 'DKK',
          label: '丹麦克朗'
        },{
          value: 'EUR',
          label: '欧元'
        },{
          value: 'GBP',
          label: '英镑'
        },{
          value: 'HKD',
          label: '港币'
        },{
          value: 'HUF',
          label: '匈牙利福林'
        },{
          value: 'IDR',
          label: '印尼盾'
        },{
          value: 'ILS',
          label: '以色列新谢克尔'
        },{
          value: 'INR',
          label: '印度卢比'
        },{
          value: 'ISK',
          label: '冰岛克朗'
        },{
          value: 'JPY',
          label: '日元'
        },{
          value: 'MYR',
          label: '马来西亚林吉特'
        },{
          value: 'NOK',
          label: '挪威克朗'
        }]
      }],
      chooseCny: false,
      wxgzh: false,
      nowC: 'CNY',
      urls:[],
      name:"HomeView_Com1",
    }
  },

  methods:{
    order(){
      this.$router.push({path:'/myOrder'})
    },
    myCollection(){
      this.$router.push({path:'/collection'})
    },
    logout(){
      localStorage.setItem('online', JSON.stringify(false));
      localStorage.removeItem('phone');
      this.$router.go(0)
      // this.$router.push({path: '/'})
      // this.showU()
    },
    showU(){
      this.isShowU = !this.isShowU;
    },
    hideU(){
      this.isShowU = false;
    },

    goHome(){
      this.$router.go(0)
    },
    gotoLog(){
      this.$router.push({name: 'log'});
    },
    startChooseCny(){
      this.chooseCny = true;
    },
    finishChooseCny(){
      this.chooseCny = false;
    },
    gotoAccountManagement() {
      this.$router.push({path: '/AccountManagement'})
    }
  },
  components:{
    // Com1_sub2,
    gzh,
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
  }


}
</script>

<style scoped>
.divsyelm2{
  position: absolute;
  top: 150px;
}
.ds1{
  background-image: url("https://jojocrazy.oss-cn-nanjing.aliyuncs.com/HomeView_Com1_4.png");
  /*height: 550px;*/
  /*filter: brightness(80%);*/
  background-color: rgba(0, 0, 0, 0.2);
  background-blend-mode: multiply;
  background-repeat: no-repeat; /* 默认重复 可设为 no-repeat*/
  background-size: 100vw 67vh;
  background-position: top left;
  background-attachment: fixed; /* 背景图片是否固定或随着页面的其余部分滚动 */
  position: absolute;
  top: 0;
  left: 0;
  width: 100vw;
  height: 67vh;;
}
.bookelb{
  font-size: 22px;
  color: white;

}
.bookelb2{
  font-size: 17px;
  color: white;
}

.circleimg{
  border-radius: 50%;
  max-height: 24px;

}
.circleimgwx{
  /*border-radius: 20%;*/
  max-height: 24px;
}
.centeri{
  align-self: center;
}
.colorw{
  background: transparent;
}
.divsyelm{
  /*box-sizing: border-box;*/
  /*display: flex;*/
  /*margin: auto;*/
  /*width: 500px;*/
  position:absolute;
  top:150px;
  left:150px;
  min-height: 300px;

}
.elm1{
  /*float:left;*/
}
.spansyelm1{
  color: white;
  font-size: 40px;

}
.spansyelm2{
  color: white;
  font-size: 25px;
}
.el-col {
  border-radius: 4px;
}

.bg-purple {
  background: #d3dce6;
}

.colorlan{
  color: cornflowerblue;
}
.bg-purple-light {
  background: #e5e9f2;
}
.grid-content {
  border-radius: 4px;
  min-height: 36px;
}
.row-bg {
  padding: 10px 0;
  background-color: #f9fafc;
}
</style>
