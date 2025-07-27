import React from 'react';

const Welcome = () => {
    const sayMessage = (message) => {
        alert(`Message: ${message}`);
    };

    return (
        <div>
            <h2>Say Welcome</h2>
            <button onClick={() => sayMessage('Welcome!')}>Say Welcome</button>
            <hr />
        </div>
    );
};

export default Welcome;
