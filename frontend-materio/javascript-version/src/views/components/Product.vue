<template>
    <div>
        <String label="ProductName" v-model="value.productName" :editMode="editMode"/>
        <CompanyId offline label="매니저" v-model="value.companyId" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>

import BaseEntity from './base-ui/BaseEntity.vue'
import String from './primitives/String.vue'
import CompanyId from './CompanyId.vue'

export default {
    name: 'Product',
    mixins:[BaseEntity],
    components:{
        String,
        CompanyId,
    },
    
    data: () => ({
        path: "products"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
