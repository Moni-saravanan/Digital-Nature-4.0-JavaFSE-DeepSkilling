import React from 'react';

const SyntheticEventExample = () => {
    const handleClick = (event) => {
        alert('I was clicked');
        console.log('Synthetic Event:', event);
    };

    return (
        <div>
            <h2>Synthetic Event Example</h2>
            <button onClick={handleClick}>OnPress</button>
            <hr />
        </div>
    );
};

export default SyntheticEventExample;
