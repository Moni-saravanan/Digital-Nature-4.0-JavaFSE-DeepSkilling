import React from 'react';

const GuestPage = () => {
    return (
        <div>
            <h2>Welcome Guest</h2>
            <p>You can browse available flights but need to log in to book tickets.</p>
            <ul>
                <li> Flight 101 - Chennai to Delhi - ₹5,000</li>
                <li> Flight 202 - Mumbai to Bangalore - ₹4,200</li>
                <li> Flight 303 - Kolkata to Hyderabad - ₹5,800</li>
            </ul>
        </div>
    );
};

export default GuestPage;
