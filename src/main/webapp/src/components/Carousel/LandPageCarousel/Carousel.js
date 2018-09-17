import React ,{Component} from 'react';
import img1 from '../../../assets/images/soc_1.jpg';
import img2 from '../../../assets/images/soc_2.jpg';
import img3 from '../../../assets/images/soc_3.jpg';

class Carousel extends Component{
    render(){
        return(
            <div style={{zIndex:'-1',marginTop:'-68px',position:'fixed'}} id="carouselExampleIndicators" className="carousel slide" data-ride="carousel">
                <ol className="carousel-indicators">
                    <li style={{width:'15px',height:'15px',borderRadius:'50%'}} data-target="#carouselExampleIndicators" data-slide-to="0" className="active"></li>
                    <li style={{width:'15px',height:'15px',borderRadius:'50%'}} data-target="#carouselExampleIndicators" data-slide-to="1" className="active"></li>
                    <li style={{width:'15px',height:'15px',borderRadius:'50%'}} data-target="#carouselExampleIndicators" data-slide-to="2" className="active"></li>
                </ol>
                <div className="carousel-inner">
                    <div className="carousel-item active">
                        <img className="d-block w-100" src={img1} alt="First slide"/>
                        <div className="carousel-caption d-none d-md-block">
                            <h5>Get Started</h5>
                            <p>Time to Join with Us</p>
                        </div>
                    </div>
                    <div className="carousel-item">
                        <img className="d-block w-100" src={img2} alt="Second slide"/>
                        <div className="carousel-caption d-none d-md-block">
                            <h5>Build Something</h5>
                            <p>Be a leader Among friends</p>
                        </div>
                    </div>
                    <div className="carousel-item">
                        <img className="d-block w-100" src={img3} alt="Third slide"/>
                        <div className="carousel-caption d-none d-md-block">
                            <h5>Spread</h5>
                            <p>Share Everything...</p>
                        </div>
                    </div>
                </div>
                <a className="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span className="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span className="sr-only">Previous</span>
                </a>
                <a className="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span className="carousel-control-next-icon" aria-hidden="true"></span>
                    <span className="sr-only">Next</span>
                </a>
            </div>
        );
    }
}

export default Carousel;