import React,{Component} from 'react';
import classes from './Services.css';
import chatImg from '../../../assets/gif/chat.gif';
import videoImg from '../../../assets/gif/video_chat.gif';
import stickerImg from '../../../assets/gif/sticker.gif';
import instantImg from '../../../assets/gif/instant.gif';
import fileUploadImg from '../../../assets/gif/file_upload.gif';
import securityImg from '../../../assets/gif/security.gif';

class Services extends Component{
    render(){
        return(
            <section className={classes.Container}>
                <h3 style={{marginTop:'2%'}}>Services</h3>
                <div className="row" style={{marginTop:'5%',display:'flex',justifyContent:'center'}}>

                    <div data-aos="flip-left" className="col-12 col-sm-6 col-md-4 col-lg-4 col-xl-4">
                        <div className={classes.Service}>
                            <img src={chatImg} alt="chat" />
                            <h5>Group Chat</h5>
                            <p>Like and reply to messages in group conversations</p>
                        </div>
                    </div>

                    <div data-aos="flip-up" className="col-12 col-sm-6 col-md-4 col-lg-4 col-xl-4">
                        <div className={classes.Service}>
                            <img src={videoImg} alt="videoImg" />
                            <h5>Audio/Video Chat</h5>
                            <p>High-quality calls for a quick “hello” or a much-needed face-to-face</p>
                        </div>
                    </div>

                    <div data-aos="flip-right" className="col-12 col-sm-6 col-md-4 col-lg-4 col-xl-4">
                        <div className={classes.Service}>
                            <img src={stickerImg} alt="stickerImg" />
                            <h5>Expressive stickers</h5>
                            <p>Tens of thousands of stickers and GIFs for every possible expression</p>
                        </div>
                    </div>

                    <div data-aos="flip-left" className="col-12 col-sm-6 col-md-4 col-lg-4 col-xl-4">
                        <div className={classes.Service}>
                            <img src={instantImg} alt="instantImg" />
                            <h5>Instant voice and video messages</h5>
                            <p>Record quick-send video and voice messages to capture the moment</p>
                        </div>
                    </div>

                    <div data-aos="flip-down" className="col-12 col-sm-6 col-md-4 col-lg-4 col-xl-4">
                        <div className={classes.Service}>
                            <img src={fileUploadImg} alt="fileUpload" />
                            <h5>Upload Files</h5>
                            <p>Upload audio, video, image, pdf or any file format</p>
                        </div>
                    </div>

                    <div data-aos="flip-right" className="col-12 col-sm-6 col-md-4 col-lg-4 col-xl-4">
                        <div className={classes.Service}>
                            <img src={securityImg} alt="securityImg" />
                            <h5>Always secure</h5>
                            <p>Our mission is to protect your privacy so that you never have to
                                think twice about what you can or can't share when you're using E-Social.</p>
                        </div>
                    </div>

                </div>
            </section>
        )
    }
}

export default Services;
