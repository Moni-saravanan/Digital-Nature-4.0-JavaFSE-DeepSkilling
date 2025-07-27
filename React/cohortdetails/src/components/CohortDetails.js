// src/components/CohortDetails.js
import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = ({ cohort }) => {
    const { name, trainer, duration, status } = cohort;

    return (
        <div className={styles.box}>
            <h3 style={{ color: status === 'ongoing' ? 'green' : 'blue' }}>
                {name}
            </h3>
            <dl>
                <dt>Trainer</dt>
                <dd>{trainer}</dd>
                <dt>Duration</dt>
                <dd>{duration}</dd>
                <dt>Status</dt>
                <dd>{status}</dd>
            </dl>
        </div>
    );
};

export default CohortDetails;
