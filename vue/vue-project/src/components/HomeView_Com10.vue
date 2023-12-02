<template>
  <div style="width: 100%;position: relative">
    <div style="text-align:left;font-size: 30px;font-weight: bold;width: 79%;margin: auto">探索中国</div>
    <div style="text-align: left;font-size: 20px;width: 79%;margin: auto">这些热门目的地精彩纷呈</div>

    <el-button @click="showPrev()" type="primary" icon="el-icon-arrow-left" class="pos1"></el-button>
    <el-button @click="showNext()" type="primary" icon="el-icon-arrow-right" class="pos2"></el-button>
    <div style="width: 79%;margin:auto;">

      <VueSlickCarousel v-bind="settings" ref="carousel" style="z-index: 2">

        <div class="wid">
          <a href="sy">
            <img src="https://r-xx.bstatic.com/xdata/images/city/170x136/683831.jpg?k=bbe0665d459d2ca7a7be29dbae2f8f4c13924f320da1a2a7bdec4f30b1e9470a&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              上海
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            1,839家住宿
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://r-xx.bstatic.com/xdata/images/city/170x136/683681.jpg?k=f832825373d70572c6e9caf42ec58a9290ff0e6d17b2ab1bb4fa7f36c5d9b3a9&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              北京
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            1,352家住宿
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://r-xx.bstatic.com/xdata/images/city/170x136/683767.jpg?k=bb33bb77be173f09b5e338b8e7ad3094e8ed6636005c97abfe365d3b8515f558&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              广州
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            1,740家住宿
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/city/170x136/683769.jpg?k=0e0f19efd51ad2ed1bbba910d7a343051fa9e2400bbb5bc97f2c49e19ca98d66&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              杭州
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            723家住宿
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/city/170x136/683820.jpg?k=59836bc9001f80aa65a845c3ade2bc0a51274081714c7a7f45005f6919dd0e31&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              三亚
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            425家住宿
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/city/170x136/683806.jpg?k=176bc3ee4fa71288a12427ff8f9b7305f79ddf9986eb726e1bc4f60165b38899&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              南京
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            440家住宿
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/city/170x136/683732.jpg?k=d757cbcfe0359c8f2a209508cf1f98252f9b5a41237dcebb57633a6d50fe5408&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              成都
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            1,380家住宿
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/city/170x136/683836.jpg?k=3b943a100222fee2a03c5b10d8d1b3f93753aa2725abdc91b75c4c7184b0e6e1&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              深圳
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            695家住宿
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://r-xx.bstatic.com/xdata/images/city/170x136/637344.jpg?k=988765be8c2692fb7dbe125c361899d9bf2c87bbce712a6e42427eaff4393552&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              苏州
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            521家住宿
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://r-xx.bstatic.com/xdata/images/city/170x136/683700.jpg?k=af45b8a2636d3ff5b31509a7ade584ff5d9d1cdf1bb440760a4e3320be5b070a&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              重庆
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            640家住宿
          </div>
          <div>
          </div>
        </div>

      </VueSlickCarousel>
      <div>
        &nbsp;
      </div>
    </div>
  </div>

</template>
<script>

import VueSlickCarousel from "vue-slick-carousel";
import 'vue-slick-carousel/dist/vue-slick-carousel.css'
import 'vue-slick-carousel/dist/vue-slick-carousel-theme.css'

export default {
  data() {
    return {
      settings: {
        "arrows":false,
        "dots": false,
        "dotsClass": "slick-dots custom-dot-class",
        "edgeFriction": 0.35,
        "infinite": false,
        "speed": 500,
        "slidesToShow":6,
        "slidesToScroll": 1,
        "draggable": false,
      },
    }
  },
  components:{
    VueSlickCarousel,
  },
  methods: {
    showNext() {
      this.$refs.carousel.next()
    },
    showPrev() {
      this.$refs.carousel.prev()
    },
  },
}
</script>

<style scoped>
.col1{
  color: #262626;
}
.col2{
  color: #6B6B6B;
}
.pos1{
  position: absolute;
  left:9%;
  top:40%;
  z-index: 4;
  color: black;
  width: 15px;
  background: #e5e9f2;
  border: #e5e9f2;
  border-radius: 60px;
}
.pos2{
  position: absolute;
  left:86.5%;
  top:40%;
  z-index: 4;
  color: black;
  width: 12px;
  background: #e5e9f2;
  border: #e5e9f2;
  border-radius: 60px;
}
.wid{
  width :170px;
  height: 136px;
}
</style>