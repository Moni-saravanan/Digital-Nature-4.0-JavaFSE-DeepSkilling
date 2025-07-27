import React from 'react';
import Cart from './Cart';

class OnlineShopping extends React.Component {
    render() {
        const items = [
            { itemname: "Laptop", price: 55000 },
            { itemname: "Smartphone", price: 18000 },
            { itemname: "Headphones", price: 2000 },
            { itemname: "Smartwatch", price: 5000 },
            { itemname: "Backpack", price: 1200 }
        ];

        return (
            <div>
                <h2>Online Shopping Cart</h2>
                {items.map((item, index) => (
                    <Cart key={index} itemname={item.itemname} price={item.price} />
                ))}
            </div>
        );
    }
}

export default OnlineShopping;
