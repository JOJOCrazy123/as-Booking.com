<template>
  <div>
    <div class="white" style="position: relative; text-align: center;">
      <div style="position: relative; text-align: center;">
        <el-row  style="position: relative; text-align: center">
          <el-col :span="7"><div class="grid-content white">
            <el-select v-model="value" filterable placeholder="目的地？"
                       clearable style="width: 100%;height: 100%; position: relative;top: 5px;">
              <template #prefix>
                <span style="top: 8px; position: relative">
                  <img :src="urls[0]" style="width: 25px">
                </span>
              </template>
              <el-option
                  v-for="item in options"
                  :key="item.value"
                  :label="item.label"
                  :value="item.value">
              <span style="float: left">
                <img :src="urls[1]" style="width: 20px; top: 5px; position: relative">
              </span>
                <span style="padding-left: 6px">{{item.label}}</span>
              </el-option>
            </el-select>
          </div>
          </el-col>

          <el-col :span="7"><div class="grid-content white">
            <div class="block" style="height: 90%;width: 100%; position: relative;top: 5px;">
              <el-date-picker
                  v-model="value1"
                  type="daterange"
                  range-separator=" —— "
                  start-placeholder="入住日期"
                  end-placeholder="退房日期"
                  style="height: 90%; width: 100%">
              </el-date-picker>
            </div>
          </div>
          </el-col>

          <el-col :span="6"><div class="grid-content white">
            <div style="height: 90%;width: 100%; position: relative;" class="block; background-color: white;">
              <el-button type="text" style="position: relative; color: black; width: 100%" @click="startChoosePeople">
                <img :src="urls[2]" style="height: 20px; text-align: right; position: relative">
                {{man}}位成人·{{child}}位儿童·{{kefang}}间客房
                <img :src="urls[3]" style="height: 20px; position: relative; text-align: left ">
              </el-button>
              <!--          choosepeople-->
              <div v-if="choosepeople">
                <el-card>
                  <el-row>
                    <div class="chooseren">
                <span class="spanleft">
                  成人
                </span>
                      <el-input-number v-model="man" :min="1" label="成人"></el-input-number>
                    </div>
                  </el-row>
                  <el-row>
                    <div class="chooseren">
                <span class="spanleft">
                  儿童
                </span>
                      <el-input-number v-model="child" :min="0" label="儿童"></el-input-number>
                    </div>
                  </el-row>
                  <el-row >
                    <div class="chooseren">
                <span class="spanleft">
                  客房
                </span>
                      <el-input-number v-model="kefang" :min="1" label="客房"></el-input-number>
                    </div>
                  </el-row>
                  <el-row >
                    <el-button class="chooseren" type="primary" plain @click="finishChoosePeople">
                      完成
                    </el-button>
                  </el-row>
                </el-card>
              </div>
            </div>
          </div></el-col>
          <el-col :span="3"><div class="grid-content white">
            <el-button type="primary" style="height: 100%;width: 100%; position: relative; font-size: 22px"
                       @click="gotoSr">
              <b>
                搜特价
              </b>
            </el-button>

          </div></el-col>
        </el-row>
      </div>
    </div>
    <el-checkbox label="我要出差"></el-checkbox>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
    return {
      choosepeople: false,
      man: 1,
      child: 0,
      kefang: 1,
      value1: [],
      options: [],
      value: 'beijing01',
      name:"Com2_sub1",
      urls:[],
    }
  },
  created() {
    this.options = this.$root.options
    this.value = this.$root.value
    this.checkList = this.$root.checkList
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
    finishChoosePeople(){
      this.choosepeople = false;
    },
    startChoosePeople(){
      this.choosepeople = true;
    },
    gotoSr(){
      // this.$router.push({path: '/sr'})
    },
  },
  watch: {
    value1(val) {
      this.$root.value1 = val
    },
    value(val) {
      this.$root.value = val
    },
    man(val) {
      this.$root.man = val
    },
    child(val) {
      this.$root.child = val
    },
    kefang(val) {
      this.$root.kefang = val
    },
    checkList(val) {
      this.$root.checkList = val
    },
  },
}
</script>

<style scoped>
.chooseren{
  position: relative;
  width: 100%;
  height: 90%;
}
.sdiv2{
  background: rgb(254,187,2);

}
.grid-content {
  border-radius: 4px;
  height: 52px;
}
.bg-purple {
  background: #d3dce6;
}
.white{
  background: white;
}
.spanleft{
  position: relative;
  text-align: left;
}
</style>
