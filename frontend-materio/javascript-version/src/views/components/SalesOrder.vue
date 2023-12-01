<template>
    <div>
        <String label="SalesPerson" v-model="value.salesPerson" :editMode="editMode"/>
        <CompanyId offline label="CompanyId" v-model="value.companyId" :editMode="editMode" @change="change"/>
        <SalesProductDetailGrid label="SalesProducts" offline v-model="value.salesProducts" :editMode="editMode" @change="change"/>

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
import SalesProductDetailGrid from './ui/SalesProductDetailGrid.vue'

export default {
    name: 'SalesOrder',
    mixins:[BaseEntity],
    components:{
        String,
        CompanyId,
        SalesProductDetailGrid,
    },
    
    data: () => ({
        path: "salesOrders"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
