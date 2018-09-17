import * as actionTypes from './actions';

export const toggleOnHandle=(data)=>{
    return{
        type:actionTypes.HANDLE_TOGGLE,
        value:data
    }
}