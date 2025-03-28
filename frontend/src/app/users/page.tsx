'use client';

import { useState, useEffect } from 'react';

export default function Home() {
    const [userData, setUserData] = useState(null);

    useEffect(() => {
        const fetchUsers = async () => {
            const response = await fetch('http://localhost:8080/api/v1/users');
            const data = await response.json();
            setUserData(data);
        };

        fetchUsers();
    }, []);

    return (
        <>
            {userData ? (
                <pre>{JSON.stringify(userData, null, 2)}</pre>
            ) : (
                <div>Loading...</div>
            )}
        </>
    );
}