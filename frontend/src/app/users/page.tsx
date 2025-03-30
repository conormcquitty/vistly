'use client';

import { useState, useEffect } from 'react';

export default function Home() {
    const [users, setUsers] = useState(null);

    useEffect(() => {
        const fetchUsers = async () => {
            const response = await fetch('http://localhost:8080/api/v1/users');
            const data = await response.json();
            setUsers(data);
        };

        fetchUsers();
    }, []);

    return (
        <>
            <pre>{JSON.stringify(users, null, 2)}</pre>
        </>
    );
}