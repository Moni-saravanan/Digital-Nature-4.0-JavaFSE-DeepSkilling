import React from 'react';

class Cart extends React.Component {
    render() {
        return (
            <div style={{ border: "1px solid black", margin: "10px", padding: "10px", borderRadius: "5px" }}>
                <h3>Item: {this.props.itemname}</h3>
                <p>Price: ₹{this.props.price}</p>
            </div>
        );
    }
}

// Setting default props
Cart.defaultProps = {
    itemname: "Unknown Item",
    price: 0
};

export default Cart;
