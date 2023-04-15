import { LoginRegisterData } from '../types/LoginRegisterData';
import axios from 'axios';

export const validateUser = async ({ data, formType }: LoginRegisterData) => {
    try {
        const response = await axios.post(`http://localhost:8080/${formType}`, data, {
            headers: {
                'Content-Type': 'application/json'
            }
        });

        const token = await response.data.token;
        localStorage.setItem('token', token);

        // extract the expiration time from the decoded token
        const decodedToken = JSON.parse(atob(token.split('.')[1]));
        const expirationTime = decodedToken.exp;
        return expirationTime;
    } catch (error: any) {
        return false;
    }
}