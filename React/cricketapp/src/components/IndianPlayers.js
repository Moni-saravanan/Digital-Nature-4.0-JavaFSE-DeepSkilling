import React from 'react';

const IndianPlayers = () => {
    // Odd & Even Team - destructuring
    const oddTeam = ["Kohli", "Gill", "Iyer", "Pant", "Jadeja"];
    const evenTeam = ["Rohit", "Rahul", "Hardik", "Kuldeep", "Bumrah"];

    const [p1, p2, p3, p4, p5] = oddTeam;
    const [q1, q2, q3, q4, q5] = evenTeam;

    // Merge two arrays using spread operator
    const T20Players = ["Dhoni", "Yuvraj"];
    const RanjiPlayers = ["Pujara", "Ashwin"];
    const mergedPlayers = [...T20Players, ...RanjiPlayers];

    return (
        <div>
            <h2>Odd Team Players</h2>
            <ul>
                <li>{p1}</li>
                <li>{p2}</li>
                <li>{p3}</li>
                <li>{p4}</li>
                <li>{p5}</li>
            </ul>

            <h2>Even Team Players</h2>
            <ul>
                <li>{q1}</li>
                <li>{q2}</li>
                <li>{q3}</li>
                <li>{q4}</li>
                <li>{q5}</li>
            </ul>

            <h2>Merged T20 + Ranji Players</h2>
            <ul>
                {mergedPlayers.map((player, idx) => (
                    <li key={idx}>{player}</li>
                ))}
            </ul>
        </div>
    );
};

export default IndianPlayers;
