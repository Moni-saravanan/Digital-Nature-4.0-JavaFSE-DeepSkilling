import React from 'react';
import Post from './Post';

class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false,
        };
    }

    // Step 4: Method to load posts using Fetch API
    loadPosts = () => {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then((response) => response.json())
            .then((data) => this.setState({ posts: data.slice(0, 10) })) // limit to 10 posts
            .catch((error) => {
                console.error("Fetch error:", error);
                this.setState({ hasError: true });
            });
    };

    // Step 5: Lifecycle hook
    componentDidMount() {
        this.loadPosts();
    }

    // Step 6: Lifecycle hook to catch errors
    componentDidCatch(error, info) {
        alert("An error occurred in the component.");
        console.log("Error:", error);
        console.log("Info:", info);
        this.setState({ hasError: true });
    }

    render() {
        if (this.state.hasError) {
            return <h2>Something went wrong while displaying posts.</h2>;
        }

        return (
            <div>
                <h2>Blog Posts</h2>
                {this.state.posts.map((post) => (
                    <Post key={post.id} title={post.title} body={post.body} />
                ))}
            </div>
        );
    }
}

export default Posts;
