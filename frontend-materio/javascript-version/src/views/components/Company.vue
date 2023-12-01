<template>
    <div>
        <String label="Name" v-model="value.name" :editMode="editMode"/>
        <Boolean label="IsTeam" v-model="value.isTeam" :editMode="editMode"/>
        <Number label="Age" v-model="value.age" :editMode="editMode"/>
        <Date label="EnteringDate" v-model="value.enteringDate" :editMode="editMode"/>

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
import Boolean from './primitives/Boolean.vue'
import Number from './primitives/Number.vue'
import Date from './primitives/Date.vue'

export default {
    name: 'Company',
    mixins:[BaseEntity],
    components:{
        String,
        Boolean,
        Number,
        Date,
    },
    
    data: () => ({
        path: "companies"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
