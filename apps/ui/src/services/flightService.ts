import { api } from 'boot/axios';

const FLIGHT_PATH = '/flight'

export const getFlights = (options = {}) => {
  return api.get(FLIGHT_PATH, options);
};