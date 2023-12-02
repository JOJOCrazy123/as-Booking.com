<template>
  <div style="width: 100%;position: relative">
    <div style="text-align:left;font-size: 30px;font-weight: bold;width: 79%;margin: auto">根据住宿类型浏览</div>
    <el-button @click="showPrev()" type="primary" icon="el-icon-arrow-left" class="pos1"></el-button>
    <el-button @click="showNext()" type="primary" icon="el-icon-arrow-right" class="pos2"></el-button>
    <div style="width: 79%;margin:auto;">
      <VueSlickCarousel v-bind="settings" ref="carousel" style="z-index: 2">
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/57584488.jpeg?k=d8d4706fc72ee789d870eb6b05c0e546fd4ad85d72a3af3e30fb80ca72f0ba57&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              酒店
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            957,582家酒店
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/119467716.jpeg?k=63b69100225782d08fbd4d0205bf949c0be894ab946a0366edb8ad48e9c0ef46&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              公寓
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            1,053,115间公寓
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/45450084.jpeg?k=f8c2954e867a1dd4b479909c49528531dcfb676d8fbc0d60f51d7b51bb32d1d9&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              度假村
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            19,144个度假村
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/100235855.jpeg?k=61ef6692e05b5971e2e8dc75687f844e6d0ad295a9a5ace17f7c713f167e61b5&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              别墅
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            569,370家别墅
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/52979454.jpeg?k=98337a30d1016ebce1cbebb9e24ba4585f535438bc455ff9efcaee27960ac8b2&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              木屋
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            41,410间木屋
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://r-xx.bstatic.com/xdata/images/xphoto/263x210/45450074.jpeg?k=7039b03a94f3b99262c4b3054b0edcbbb91e9dade85b6efc880d45288a06c126&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              乡村别墅
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            620,928栋乡村别墅
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/45450090.jpeg?k=52f6b8190edb5a9c91528f8e0f875752ce55a6beb35dc62873601e57944990e4&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              豪华帐篷
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            15,336处豪华帐篷地
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/45450058.jpeg?k=2449eb55e8269a66952858c80fd7bdec987f9514cd79d58685651b7d6e9cdfcf&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              公寓式酒店
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            39,362家公寓式酒店
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/45450113.jpeg?k=76b3780a0e4aacb9d02ac3569b05b3c5e85e0fd875287e9ac334e3b569f320c7&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              度假屋
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            569,370间度假屋
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/45450073.jpeg?k=795a94c30433de1858ea52375e8190a962b302376be2e68aa08be345d936557d&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              旅馆
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            107,348家旅馆
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/45450082.jpeg?k=beb101b827a729065964523184f4db6cac42900c2415d71d516999af40beb7aa&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              青旅
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            17,756家青旅
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/45450093.jpeg?k=aa5cc7703f3866af8ffd6de346c21161804a26c3d0a508d3999c11c337506ae1&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              汽车旅馆
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            13,293家汽车旅馆
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://r-xx.bstatic.com/xdata/images/xphoto/263x210/45450056.jpeg?k=251e2507d43a24a4c58bb961b8d157147d56efbf91b49f9606bc768c58f581e4&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              住宿加早餐旅馆
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            206,621家住宿加早餐旅馆
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://r-xx.bstatic.com/xdata/images/xphoto/263x210/45450279.jpeg?k=cb9ab85ffe439f3030e00281f2d52583a398bf076e54f00f746e1d1baf62bf6e&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              日式旅馆
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            2,218家日式旅馆
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://r-xx.bstatic.com/xdata/images/xphoto/263x210/45450064.jpeg?k=4d4ea22dc4828fd55a3889e90531c9841ddb2d9abf460c420cdd24f2a9b658d2&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              庭院旅馆
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            1,396家庭院旅馆
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/45450068.jpeg?k=41cc7c5449011323aaaaed4e845cb16200b5d540c77a50c1bea90399a1e92d70&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              度假公园
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            5,995家度假公园
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/45450066.jpeg?k=4adfab312f5d26da9f81da48d8c95ca8f108215b2c84085590891a9e0e17b144&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              民宿
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            148,654间民宿
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://r-xx.bstatic.com/xdata/images/xphoto/263x210/45450283.jpeg?k=44ef0e355cff36883935e4c99b5c01b035eabebad278d22363210b2fe40b2791&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              露营地
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            11,198个露营地
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://r-xx.bstatic.com/xdata/images/xphoto/263x210/45450103.jpeg?k=a1fa72362160b1df6e288050afa7ce1aade80871acd368ddd4a4ebf6ad87764e&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              乡村民宿
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            12,762间乡村民宿
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://r-xx.bstatic.com/xdata/images/xphoto/263x210/45450080.jpeg?k=15d9709efa513f2b23b5fa8d5234d87bdee2bf97b3e7552244592da11413db9a&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              农家乐
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            11,834家农家乐
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/45450095.jpeg?k=cd5e46e632dab722d22217813485efde31fbe82f5f26a624166edccdbe8187bc&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              船屋
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            2,042家船屋
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/45450097.jpeg?k=eac0f917a53dc395bd379fef8c191e7d5e37012b68e60232e4f6bba2a2901b7a&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              豪华帐篷
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            5,188个豪华帐篷
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/45450075.jpeg?k=d23cf8443780ac09f46f59e40393d75dbe64b06029b4959c60b81b7fdefc9be0&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              自助式住宿
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            904,685家自助式住宿
          </div>
          <div>
          </div>
        </div>
        <div class="wid">
          <a href="sy">
            <img src="https://q-xx.bstatic.com/xdata/images/xphoto/263x210/57175023.jpeg?k=dc0319d4d64ded9ee4b0ddb162a2e80db7899300b7bf21b34506888895d74c79&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              小屋
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            852间小屋
          </div>
          <div>
          </div>
        </div>
      </VueSlickCarousel>
    </div>
  </div>

</template>
<script>

import VueSlickCarousel from 'vue-slick-carousel'
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
        "slidesToShow":4,
        "slidesToScroll": 1,
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
  width :270px;
  height: 210px;
}
</style>
