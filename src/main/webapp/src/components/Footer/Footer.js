import React,{Component} from 'react';
import classes from './Footer.css';
import paypalIcon from '../../assets/images/PayPal.png';

class Footer extends Component{

    render(){
        return(
            <div className={classes.Container}>
                <div className="row" style={{marginTop:'7%'}} >

                    <div style={{marginTop:'4%',marginBottom:'10%'}} className="col-12 col-sm-12 col-md-6 col-lg-3 col-xl-3">
                        <h6>About Us</h6>
                        <hr/>
                        <p>E-Social is a computer-based technology that facilitates the sharing of ideas and information and the building of virtual networks
                            and communities. By design, social media is internet based and offers users easy electronic communication of personal information
                            and other content and often utilizing it for messaging.</p>
                    </div>

                    <div style={{marginTop:'4%'}} className="col-12 col-sm-12 col-md-6 col-lg-3 col-xl-3">
                        <h6>Payment Methods</h6>
                        <hr/>
                        <div className={classes.Image}>
                            <img width="260px" src={paypalIcon} alt="paypal" />
                        </div>

                    </div>

                    <div style={{marginTop:'4%'}} className="col-12 col-sm-12 col-md-6 col-lg-3 col-xl-3">
                        <h6>Tags</h6>
                        <hr/>
                        <div style={{display:'flex',justifyContent:'center',flexWrap:'wrap'}}>
                            <div className={classes.Tag}>React</div>
                            <div className={classes.Tag}>JavaScript</div>
                            <div className={classes.Tag}>Java</div>
                            <div className={classes.Tag}>Spring Rest</div>
                            <div className={classes.Tag}>Spring Data Jpa</div>
                            <div className={classes.Tag}>Spring Security</div>
                            <div className={classes.Tag}>Spring Social</div>
                            <div className={classes.Tag}>Social Media</div>
                        </div>
                    </div>

                    <div style={{marginTop:'4%'}} className="col-12 col-sm-12 col-md-6 col-lg-3 col-xl-3">
                        <h6>Contact Us</h6>
                        <hr/>
                        <p>+94 34 2245679</p>
                        <p>+94 76 6234152</p>
                        <p><b>Developed By:</b>Vidurajith Darshana</p>
                    </div>

                </div>
                <div className={classes.Licens} >Copyright © VIDU. All Rights Reserved.</div>
            </div>
        )
    }
}

export default Footer;