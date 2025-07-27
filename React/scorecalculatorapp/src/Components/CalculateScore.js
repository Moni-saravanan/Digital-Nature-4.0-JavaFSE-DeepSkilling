const percentToDecimal = (decimal) => {
    return (decimal.toFixed(2) + '%')
}

const calcScore = (total, goal) => {
    return percentToDecimal(total / goal)
}

export const CalculateScore = ({ name, school, total, goal }) => (
    <div className="formatstyle">
        <h1><font color="Brown">Student Details:</font></h1>
        <div className="School">
            <b><span>School:</span></b>
            <span>{school}</span>
        </div>
        <div className="Total">
            <b><span>Total:</span></b>
            <span>{total}</span>
        </div>
        <div className="Score">
            <b><span>Score:</span></b>
            <span>{calcScore(total, goal)}</span>
        </div>
    </div>
)