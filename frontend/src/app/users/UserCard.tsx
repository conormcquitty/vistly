export function UserCard({user}) {
    return (
        <div className="max-w-">
            {JSON.stringify(user, null, 2)}
        </div>
    );
}