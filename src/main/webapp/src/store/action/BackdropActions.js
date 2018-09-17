import * as actionTypes from './actions';

export const backdropOnHandle=(data)=>{
    return{
        type:actionTypes.HANDLE_BACKDROP,
        value:data
    }
}