<template>
  <div class="newquickchoose">
    <div style="text-align:left;font-size: 30px;font-weight: bold;width: 79%;margin: auto">快速轻松地规划旅行</div>

    <div style="text-align: left;font-size: 20px;width: 79%;margin: auto">选择你喜欢的氛围与主题，探索中国的热门目的地</div>

    <div style="text-align: left;width: 79%;margin: auto">
      <el-button round @click="change(0)" :class="{ newStyle:0===number}">
        <div style="float: left;display: inline;height: 30px">
          <img :src="urls[0]" height="30">
        </div>
        <div style="float: left;display: inline;margin-top: 7px">
          <p style="font-size: 15px">
            城市
          </p>
        </div>

      </el-button>
      <el-button round @click="change(1)" :class="{ newStyle:1===number}">
        <div style="float: left;display: inline;height: 30px">
          <img :src="urls[1]" height="30">
        </div>
        <div style="float: left;display: inline;margin-top: 7px">
          <p style="font-size: 15px">
            户外
          </p>
        </div>
      </el-button>
      <el-button round @click="change(2)" :class="{ newStyle:2===number}">
        <div style="float: left;display: inline;height: 30px">
          <img :src="urls[2]" height="30">
        </div>
        <div style="float: left;display: inline;margin-top: 7px">
          <p style="font-size: 15px">
            浪漫
          </p>
        </div>
      </el-button>
      <el-button round @click="change(3)" :class="{ newStyle:3===number}">
        <div style="float: left;display: inline;height: 30px">
          <img :src="urls[3]" height="30">
        </div>
        <div style="float: left;display: inline;margin-top: 7px">
          <p style="font-size: 15px">
            海滩
          </p>
        </div>
      </el-button>
      <el-button round @click="change(4)" :class="{ newStyle:4===number}">
        <div style="float: left;display: inline;height: 30px">
          <img :src="urls[4]" height="30">
        </div>
        <div style="float: left;display: inline;margin-top: 7px">
          <p style="font-size: 15px">
            休闲
          </p>
        </div>
      </el-button>
    </div>

    <div style="text-align: left; margin: auto">
      <div v-if="number === 0">
        <city></city>
      </div>
      <div v-if="number === 1">
        <outside></outside>
      </div>
      <div v-if="number === 2">
        <romantic></romantic>
      </div>
      <div v-if="number === 3">
        <beach></beach>
      </div>
      <div v-if="number === 4">
        <relax></relax>
      </div>
    </div>
    <div style="display: block; text-align: left;" >
      <div style="font-size: 30px; font-weight: bold; width: 79%; margin: auto">精彩下一站，灵感这里找</div>
      <el-link style="margin-left: 85%;font-size: 23px"  type="primary" href="https://www.baidu.com">更多</el-link>
    </div>
  </div>
</template>

<script>

import city from "../components/sub_components/Com7_sub1.vue";
import outside from "../components/sub_components/Com7_sub2.vue";
import beach from "../components/sub_components/Com7_sub3.vue";
import romantic from "../components/sub_components/Com7_sub4.vue";
import relax from "../components/sub_components/Com7_sub5.vue";
import axios from "axios";

export default {
  name: 'HomeView_Com7',
  components: {
    city,
    outside,
    beach,
    romantic,
    relax,
  },
  data() {
    return {
      number:0,
      urls:[],
      name:"HomeView_Com7",
    }
  },
  methods: {
    change: function (index) {
      this.number = index;
    },
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
