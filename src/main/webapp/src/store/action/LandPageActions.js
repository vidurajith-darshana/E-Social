import * as actionTypes from './actions';

export const scrollOnHandle=(data)=>{
    return{
        type:actionTypes.HANDLE_SCROLL_LAND_PAGE,
        value:data
    }
}