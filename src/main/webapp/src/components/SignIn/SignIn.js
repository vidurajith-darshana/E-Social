import React,{Component} from 'react';
import classes from './SignIn.css';
import Ext from "../../hoc/Ext/Ext";
import TextField from "../TextField/TextField";
import SignCard from "../SignCard/SignCard";
import {Link, withRouter} from "react-router-dom";

class SignIn extends Component{
    render(){

        return(
            <Ext>
                <div className="row">
                    <div style={{display:'flex',justifyContent:'center'}} className="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                        <SignCard>
                            <h1 style={{color:'lightblue'}}>Hi , Vidurajith</h1>
                            <div className={classes.Content}>
                                <div className="row">

                                    {/*user name*/}

                                    <div style={{display:'flex',justifyContent:'center'}} className="col-3 col-sm-3 col-md-3 col-lg-3 col-xl-3">
                                        <i className="fa fa-user-circle-o" style={{marginTop:'20px',fontSize:'25px',color:'#07f'}} aria-hidden="true"></i>
                                    </div>
                                    <div style={{display:'flex',justifyContent:'flex-end'}} className="col-9 col-sm-9 col-md-9 col-lg-9 col-xl-9">
                                        <TextField placeholder="Email" type="email"/>
                                    </div>

                                    {/*password*/}

                                    <div style={{display:'flex',justifyContent:'center'}} className="col-3 col-sm-3 col-md-3 col-lg-3 col-xl-3">
                                        <i className="fa fa-unlock-alt" style={{marginTop:'20px',fontSize:'25px',color:'#07f'}} aria-hidden="true"></i>
                                    </div>
                                    <div style={{display:'flex',justifyContent:'flex-end'}} className="col-9 col-sm-9 col-md-9 col-lg-9 col-xl-9">
                                        <TextField placeholder="Password" type="password"/>
                                    </div>

                                    <div style={{display:'flex',justifyContent:'center',marginTop:'5%'}} className="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                                        <button type="button" style={{outline:'none',boxShadow:'none',width:'150px'}} className="btn btn-primary">Login</button>
                                    </div>

                                    <div style={{display:'flex',justifyContent:'center',marginTop:'3%'}} className="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                                        <Link style={{textDecoration:'none'}} to="/user/forget">Trouble With Login?</Link>
                                    </div>

                                    <div style={{display:'flex',justifyContent:'center',marginTop:'3%'}} className="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                                        <Link style={{color:'green'}} to="/user/signup">Create New Account</Link>
                                    </div>

                                </div>
                            </div>
                        </SignCard>
                    </div>
                </div>
            </Ext>
        );
    }
}

export default withRouter(SignIn);