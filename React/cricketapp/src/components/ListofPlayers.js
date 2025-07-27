import React from 'react';

const ListofPlayers = () => {
    const players = [
        { name: "Virat Kohli", score: 88 },
        { name: "Rohit Sharma", score: 72 },
        { name: "KL Rahul", score: 65 },
        { name: "Shubman Gill", score: 91 },
        { name: "Shreyas Iyer", score: 45 },
        { name: "Rishabh Pant", score: 83 },
        { name: "Hardik Pandya", score: 58 },
        { name: "Ravindra Jadeja", score: 76 },
        { name: "Kuldeep Yadav", score: 69 },
        { name: "Jasprit Bumrah", score: 95 },
        { name: "Mohammed Shami", score: 60 },
    ];

    // Players scored below 70 - arrow function + filter
    const lowScorers = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>All Players</h2>
            <ul>
                {players.map((player, index) => (
                    <li key={index}>
                        {player.name} - Score: {player.score}
                    </li>
                ))}
            </ul>

            <h2>Players with Score below 70</h2>
            <ul>
                {lowScorers.map((player, index) => (
                    <li key={index}>
                        {player.name} - Score: {player.score}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default ListofPlayers;
