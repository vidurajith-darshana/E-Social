import React,{Component} from 'react';
import classes from './Introduction.css';
import mobSmsImg from '../../../assets/images/mobSms.png';
import mobRingImg from '../../../assets/images/mobRing.png';
import mobUploadImg from '../../../assets/images/mobUpload.png';

class Introduction extends Component{
    render(){
        return(
            <section className={classes.Container}>
                <h3 style={{marginTop:'2%'}}>Introduction</h3>
                <div className="row" style={{marginTop:'5%',display:'flex',justifyContent:'center'}}>
                    <div data-aos="fade-right" className="col-12 col-sm-12 col-md-2 col-lg-2 col-xl-2">
                        <img src={mobSmsImg} alt="mob-sms" />
                    </div>
                    <div className="col-12 col-sm-12 col-md-2 col-lg-2 col-xl-2">
                        <h1>+</h1>
                    </div>

                    <div data-aos="zoom-in" className="col-12 col-sm-12 col-md-2 col-lg-2 col-xl-2">
                        <img src={mobRingImg} alt="mob-ring" />
                    </div>
                    <div className="col-12 col-sm-12 col-md-2 col-lg-2 col-xl-2">
                        <h1>+</h1>
                    </div>

                    <div data-aos="fade-left" className="col-12 col-sm-12 col-md-2 col-lg-2 col-xl-2">
                        <img src={mobUploadImg} alt="mob-upload" />
                    </div>

                </div>
                <div style={{marginTop:'3%'}}>
                    <p> E-Social is a cross-platform instant messaging and voice over IP application operated by Sri Lanka multinational
                        company E-SOCIAL, provided as freeware for the Microsoft Windows, macOS, Linux, Android and iOS platforms. It
                        requires a telephone number to operate.<br/><br/>
                        The application allows the sending of text messages and voice calls, as well as video calls, images and other media, documents, and user location.<br/><br/>
                        The application runs from a mobile device but is also accessible from desktop computers; the service requires consumer users to provide a standard cellular
                        mobile number. Originally, users could only communicate with others individually or in groups of individual users, but in September 2018, E-Social announced a
                        forthcoming business platform that will enable companies to provide customer service to users at scale.
                    </p>
                </div>
            </section>
        );
    }
}

export default Introduction;