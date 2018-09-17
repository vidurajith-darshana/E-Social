import React,{Component} from 'react';
import classes from './Content.css';
import Introduction from "./Introduction/Introduction";
import ScrollableAnchor, {configureAnchors} from 'react-scrollable-anchor';
import Services from "./Services/Services";
import Community from "./Community/Community";

class Content extends Component{

    render(){

        return(
            <div className={classes.Container}>
                <ScrollableAnchor id="introduction">
                    <Introduction/>
                </ScrollableAnchor>
                <ScrollableAnchor id="services">
                    <Services/>
                </ScrollableAnchor>
                <ScrollableAnchor id="community">
                    <Community/>
                </ScrollableAnchor>
            </div>
        );
    }
}

configureAnchors({offset: -135, scrollDuration: 1200})

export default Content;