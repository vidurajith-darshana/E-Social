import React from 'react';
import Ext from "../../hoc/Ext/Ext";
import classes from './Share.css';

const share=()=>{
    return(
        <Ext>
            <div className={classes.Container}>
                <div className={classes.Text}>Share...Join...Enjoy</div>
                <div className={classes.Break}>|</div>
                <div className={classes.Social}><i className="fa fa-facebook-square" aria-hidden="true"></i></div>
                <div className={classes.Break}>|</div>
                <div className={classes.Social}><i className="fa fa-twitter-square" aria-hidden="true"></i></div>
                <div className={classes.Break}>|</div>
                <div className={classes.Social}><i className="fa fa-linkedin-square" aria-hidden="true"></i></div>
                <div className={classes.Break}>|</div>
                <div className={classes.Social}><i className="fa fa-instagram" aria-hidden="true"></i></div>
            </div>
        </Ext>
    )
}

export default share;