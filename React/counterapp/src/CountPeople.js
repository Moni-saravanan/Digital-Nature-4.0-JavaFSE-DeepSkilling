import React from 'react';

class CountPeople extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            entryCount: 0,
            exitCount: 0
        };
    }

    // Method to update entry count
    UpdateEntry = () => {
        this.setState((prevState) => ({
            entryCount: prevState.entryCount + 1
        }));
    };

    // Method to update exit count
    UpdateExit = () => {
        this.setState((prevState) => ({
            exitCount: prevState.exitCount + 1
        }));
    };

    render() {
        return (
            <div style={{
                textAlign: "center",
                marginTop: "50px",
                fontFamily: "Arial"
            }}>
                <h2>People Counter at Mall</h2>

                <div style={{ margin: "20px" }}>
                    <button onClick={this.UpdateEntry} style={{ marginRight: "10px", padding: "10px 20px" }}>
                        Login
                    </button>
                    <button onClick={this.UpdateExit} style={{ padding: "10px 20px" }}>
                        Exit
                    </button>
                </div>

                <div style={{ fontSize: "18px" }}>
                    <p>Number of People Entered: <strong>{this.state.entryCount}</strong></p>
                    <p>Number of People Exited: <strong>{this.state.exitCount}</strong></p>
                </div>
            </div>
        );
    }
}

export default CountPeople;
