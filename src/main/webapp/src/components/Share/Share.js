import React from 'react';
import Ext from "../../hoc/Ext/Ext";
import classes from './Share.css';
import {Link} from "react-router-dom";

const share=()=>{
    return(
        <Ext>
            <div className={classes.Container}>
                <div className={classes.Text}>Share</div>
                <div className={classes.Break}>|</div>
                <div className={classes.Social}><i className="fa fa-facebook-square" aria-hidden="true"></i></div>
                <div className={classes.Break}>|</div>
                <div className={classes.Social}><i className="fa fa-twitter-square" aria-hidden="true"></i></div>
                <div className={classes.Break}>|</div>
                <div className={classes.Social}><i className="fa fa-linkedin-square" aria-hidden="true"></i></div>
                <div className={classes.Break}>|</div>
                <div className={classes.Social}><i className="fa fa-instagram" aria-hidden="true"></i></div>
                <div className={classes.Break}>|</div>
                <i style={{marginLeft:'1%'}} className="fa fa-bell" aria-hidden="true"></i>
                <div className={classes.Notifications}>12</div>
                <i style={{marginLeft:'1%'}} className="fa fa-commenting-o" aria-hidden="true"></i>
                <div className={classes.Chat}>4</div>
                <div className={classes.SignIn}><Link to="#" >Sign in</Link></div>
                <i style={{marginRight:'1%'}} className="fa fa-user-circle" aria-hidden="true"></i>
            </div>
        </Ext>
    )
}

export default share;