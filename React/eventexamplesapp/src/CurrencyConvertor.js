import React, { useState } from 'react';

const CurrencyConvertor = () => {
    const [rupees, setRupees] = useState('');
    const [euro, setEuro] = useState(null);

    const handleChange = (e) => {
        setRupees(e.target.value);
    };

    const handleSubmit = () => {
        const euroValue = parseFloat(rupees) / 90;
        setEuro(euroValue.toFixed(2));
    };

    return (
        <div>
            <h2>Currency Convertor</h2>
            <input
                type="number"
                placeholder="Enter amount in INR"
                value={rupees}
                onChange={handleChange}
            />
            <button onClick={handleSubmit}>Convert to Euro</button>
            {euro !== null && <p>Converted Amount in Euro: €{euro}</p>}
        </div>
    );
};

export default CurrencyConvertor;
