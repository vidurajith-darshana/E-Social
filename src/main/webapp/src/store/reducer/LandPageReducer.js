import * as actionTypes from '../action/actions';

const initialState={
    scroll:false
}

const reducer=(state=initialState,action)=>{
    switch (action.type) {
        case actionTypes.HANDLE_SCROLL_LAND_PAGE:
            return{
                ...state,
                scroll:action.value
            }
        default:return state;
    }
}

export default reducer;