import React, { Component } from 'react';
import './App.css';
import Routes from "./Routes/Routes";
import Backdrop from "./components/Backdrop/Backdrop";
import {withRouter} from "react-router-dom";
import Ext from "./hoc/Ext/Ext";

class App extends Component {
  render() {
    return (
      <Ext>
        <Backdrop/>
        <Routes/>
      </Ext>
    );
  }
}

export default withRouter(App);
