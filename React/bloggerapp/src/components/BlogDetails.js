import React from 'react';

const BlogDetails = ({ blogs }) => {
    return (
        <div>
            <h2>📝 Blog Articles</h2>
            {blogs.length > 0 ? (
                blogs.map((blog, i) => (
                    <div key={i}>
                        <h4>{blog.title}</h4>
                        <p>{blog.summary}</p>
                    </div>
                ))
            ) : (
                <p>No blog posts found.</p>
            )}
        </div>
    );
};

export default BlogDetails;
