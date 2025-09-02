import axios from "axios";
import { VITE_API_BASE_URL } from "../config/env";

// create an axios instance

const axiosInstance = axios.create({
  baseURL: VITE_API_BASE_URL || "http://localhost:5001/api",
  timeout: 10000,
  headers: {
    "Content-Type": "application/json",
  },
});

const http = {
  get: async (url: string) => {
    await axiosInstance
      .get(url)
      .then((res) => {
        return res.data;
      })
      .catch((error) => console.log(error.message));
  },
  post: async (url: string, data: object) => {
    await axiosInstance
      .post(url, data)
      .then((res) => {
        return res.data;
      })
      .catch((error) => console.log(error.message));
  },
  put: async (url: string, id: string, data: object) => {
    url += `/${id}`;
    await axiosInstance
      .put(url, data)
      .then((res) => {
        return res.data;
      })
      .catch((error) => console.log(error.message));
  },
  delete: async (url: string, id: string) => {
    url += `/${id}`;
    await axiosInstance
      .delete(url)
      .then((res) => {
        return res.data;
      })
      .catch((error) => console.log(error.message));
  },
};

export default http;
