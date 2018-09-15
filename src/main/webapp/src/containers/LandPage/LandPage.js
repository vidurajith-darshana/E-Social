import React,{Component} from 'react';
import Navbar from "../../components/Navbar/Navbar";
import Share from '../../components/Share/Share';

class LandPage extends Component{

    render(){
        return(
            <div>
                <Share/>
                <Navbar/>
            </div>
        )
    }
}

export default LandPage;