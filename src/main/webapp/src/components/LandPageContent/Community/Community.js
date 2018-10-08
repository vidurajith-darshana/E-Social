import React,{Component} from 'react';
import classes from './Community.css';
import communityImg from '../../../assets/images/community.jpg';

class Community extends Component{
    render(){
        return(
            <section className={classes.Container}>
                <h3 style={{marginTop:'2%'}}>Community</h3>
                <div data-aos="zoom-in">
                    <img src={communityImg} alt="community"/>
                    <div className={classes.Center}>
                        <div style={{display:'flex',justifyContent:'center',flexDirection:'column',color:'white'}}>
                            <h5>Welcome to Community!</h5>
                            <h1>Connect,Share & Engage</h1>
                            <br/>
                            <p>From families to friendships, we share experiences and<br/> interactions with groups. Our attachments
                                to those<br/> groups strong or weak weave the fabric of association and community.</p>
                        </div>
                        <div style={{marginTop:'5%'}} className="row">
                            <div style={{textAlign:'right'}} className="col-6 col-sm-6 col-md-6 col-xl-6 col-lg-6">
                                <a href="/user/signup" style={{width:'150px',boxShadow:'none',outline:'none !important'}} role="button" className="btn btn-outline-primary">SignUp</a>
                            </div>
                            <div style={{textAlign:'left'}} className="col-6 col-sm-6 col-md-6 col-xl-6 col-lg-6">
                                <a href="/user/signin" style={{width:'150px',boxShadow:'none',outline:'none !important'}} role="button" className="btn btn-outline-danger">Login</a>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        );
    }
}

export default Community;