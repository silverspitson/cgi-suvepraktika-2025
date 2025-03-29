<template>
  <q-page>
    <div class="row">
      <div class="q-pa-md justify-evenly col-12 ">
        <q-table
          title="Flights"
          :rows="flights"
          :columns="columns"
          virtual-scroll
          binary-state-sort
          v-model:pagination="pagination"
          :rows-per-page-options="[0]"
        >
        <!-- style="height: 400px" -->
          <template v-slot:body-cell-selectFlight="props">
            <q-td :props="props">
              <q-btn 
                @click="selectFlight(props.row.id)"
                label="SELECT"
                filled

              />
            </q-td>
          </template>
        </q-table>
      </div>
    </div>
    
  </q-page>
</template>

<script setup lang="ts">

import { onMounted, ref } from 'vue';
import { getFlights } from 'src/services/flightService';
import type { Flight } from 'src/models/flight';
import type { QTableProps } from 'quasar';
import  { date } from 'quasar';

const pagination = ref({rowsPerPage: 0})
const flights = ref<Flight[]>([]);
const columns: QTableProps['columns'] = [
  { name: 'destination', align: 'left', label: 'Destination', field: 'destination', sortable: true},
  { name: 'flightDate', align: 'left', label: 'Flight date', field: 'flightDate', sortable: true, format: (value) => formatDate(value)},
  { name: 'duration', align: 'left', label: 'Flight duration', field: 'duration', format: (value) => formatDuration(value)},
  { name: 'price', align: 'left', label: 'Price', field: 'price', sortable: true},
  { name: 'selectFlight', align: 'right', label: '', field: ''}
]

const formatDuration = (flightDuration: Date) => {
  const formattedDuration = date.formatDate(flightDuration, "HH:mm").split(":")
  return `${formattedDuration[0]}h ${formattedDuration[1]}min`;
}

const formatDate = (flightDate: Date) => {
  return date.formatDate(flightDate, "YYYY-MM-DD HH:mm:ss")
}

const fetchFlights = async() => {
  try {
    const response = await getFlights();
    flights.value = response.data;
  } catch(error) {
    console.error(error);
  };
}

const selectFlight = (id: number) => {
  try {
    console.log("selected flight id: "+id);
  } catch(error) {
    console.log(error);
  }
  
}

onMounted(() => {
  fetchFlights()
})
</script>
