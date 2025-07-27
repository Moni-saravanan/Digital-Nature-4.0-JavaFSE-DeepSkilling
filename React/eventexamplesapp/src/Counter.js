import React, { Component } from 'react';

class Counter extends Component {
    constructor() {
        super();
        this.state = {
            count: 0,
        };
        this.handleIncrement = this.handleIncrement.bind(this);
    }

    increment() {
        this.setState({ count: this.state.count + 1 });
    }

    sayHello() {
        alert('Hello! Counter incremented!');
    }

    handleIncrement() {
        this.increment();
        this.sayHello();
    }

    handleDecrement = () => {
        this.setState({ count: this.state.count - 1 });
    };

    render() {
        return (
            <div>
                <h2>Counter</h2>
                <p>Value: {this.state.count}</p>
                <button onClick={this.handleIncrement}>Increment</button>
                <button onClick={this.handleDecrement}>Decrement</button>
                <hr />
            </div>
        );
    }
}

export default Counter;
