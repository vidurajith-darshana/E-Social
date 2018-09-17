import * as actionTypes from '../action/actions';

const initialState={
    click:false
}

const reducer=(state=initialState,action)=>{
    switch (action.type) {
        case actionTypes.HANDLE_TOGGLE:
            return{
                ...state,
                click:action.value
            }
        default:return state;
    }
}

export default reducer;