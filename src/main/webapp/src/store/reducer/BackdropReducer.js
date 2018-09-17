import * as actionTypes from '../action/actions';

const initialState={
    open:false
}

const reducer=(state=initialState,action)=>{
    switch (action.type) {
        case actionTypes.HANDLE_BACKDROP:
            return{
                ...state,
                open:action.value
            };
        default:return state;
    }
}

export default reducer;